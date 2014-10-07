import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	// ������� 10 - ����������� �� ��������� � ����������� ������������

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle triangle = new Triangle(0, 0, 0, 8, -6, 0);
		analyseTriangle(triangle);
		triangle.rotate(90);
		analyseTriangle(triangle);
		triangle.shift(0, 5);
		analyseTriangle(triangle);
		triangle.shift(-2, -2);
		analyseTriangle(triangle);
	}

	// ��� ������ �� ����� ��� ����� ��������� �� 2 ������ ����� �������
	// � ������� ������ BigDecimal:
	private static double round(double number) {
		return new BigDecimal(number).setScale(2, RoundingMode.HALF_UP)
				.doubleValue();
	}

	// ����� ���������� �� ������������
	private static void analyseTriangle(Triangle triangle) {
		System.out.println("---==== ������ ������������ ===---");

		// ����� ��������� ������ ������������
		double[] vertices = triangle.getVerticesCoordinates();
		System.out.print("�������: ");
		System.out.print("  A(" + round(vertices[0]) + "; "
				+ round(vertices[1]) + "),");
		System.out.print("  B(" + round(vertices[2]) + "; "
				+ round(vertices[3]) + "),");
		System.out.println("  C(" + round(vertices[4]) + "; "
				+ round(vertices[5]) + ")");

		// ����� ���� ������
		double[] lengths = triangle.getSideLengths();
		System.out.print("����� ������: ");
		System.out.print("  AB = " + round(lengths[0]) + ",");
		System.out.print("  BC = " + round(lengths[1]) + ",");
		System.out.println("  AC = " + round(lengths[2]) + ",");

		// ����� ����� (� ��������)
		double[] angles = triangle.getAngles();
		System.out.print("���� (� ��������): ");
		System.out.print("  A = " + round(angles[0] * 180 / Math.PI) + ",");
		System.out.print("  B = " + round(angles[1] * 180 / Math.PI) + ",");
		System.out.println("  C = " + round(angles[2] * 180 / Math.PI) + ",");

		// ����� �������
		System.out.println("�������:   S = " + round(triangle.getArea()));

		System.out.println("---============================---");

	}
}
