public class Vector {
	// ������ �� ���������, �������� ����� �������
	private Point mInitialPoint;
	private Point mTerminalPoint;

	public Vector(Point a, Point b) {
		this.mInitialPoint = new Point(a);
		this.mTerminalPoint = new Point(b);
	}

	// ���������� �������
	public double getComponentX() {
		return (this.mTerminalPoint.x - this.mInitialPoint.x);
	}

	public double getComponentY() {
		return (this.mTerminalPoint.y - this.mInitialPoint.y);
	}

	// ��������� ������������ �� ������
	public double scalarProduct(Vector v) {
		return (this.getComponentX() * v.getComponentX() + this.getComponentY()
				* v.getComponentY());
	}

	// ����� �������
	public double length() {
		return Math.sqrt(Math.pow(this.getComponentX(), 2)
				+ Math.pow(this.getComponentY(), 2));
	}

	// ���� ����� ��������� this � v (������� ������� �� ����� �����)
	public double angleWith(Vector v) {
		return Math.acos(this.scalarProduct(v) / (this.length() * v.length()));
	}

	// �������������� � �������� v
	public boolean isCollinearWith(Vector v) {
		return (this.getComponentX() * v.getComponentY() - this.getComponentY()
				* v.getComponentX() == 0);
	}

}
