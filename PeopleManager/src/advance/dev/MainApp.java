package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.dao.Teacher;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo một đối tượng Manager
		Manager manager = new Manager();

		// Thêm giáo viên vào danh sách
		manager.addTeacher(new Teacher("Bình", 35, "T001"));
		manager.addTeacher(new Teacher("Đạt", 40, "T002"));
		manager.addTeacher(new Teacher("Dũng", 30, "T003"));

		// In ra danh sách giáo viên hiện có
		manager.printTeacherList();

		// In ra số giáo viên hiện có trong danh sách
		System.out.println("Số lượng giáo viên: " + manager.getNumberOfTeachers());

		// Lấy ra thông tin của giáo viên cao tuổi nhất
		Teacher oldestTeacher = manager.getOldestTeacher();
		if (oldestTeacher != null) {
			System.out.println("Giáo viên lớn tuổi nhất:");
			System.out.println("Name: " + oldestTeacher.getName());
		} else {
			System.out.println("Không có giáo viên nào trong danh sách.");
		}
	}

}
