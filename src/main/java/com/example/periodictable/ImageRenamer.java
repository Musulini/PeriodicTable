package com.example.periodictable;

import java.io.File;

public class ImageRenamer {

	public static void main(String[] args) {
		String folderPath = "C:/path/to/your/images"; // Change this to your folder path
		File folder = new File(folderPath);
		File[] files = folder.listFiles((dir, name) -> name.toLowerCase().matches(".*\\.(jpg|png|jpeg|gif|bmp)"));

		if (files == null || files.length == 0) {
			System.out.println("No images found.");
			return;
		}

		int counter = 1;
		for (File file : files) {
			String extension = file.getName().substring(file.getName().lastIndexOf('.'));
			File newFile = new File(folder, counter + extension);

			if (file.renameTo(newFile)) {
				System.out.println("Renamed: " + file.getName() + " -> " + newFile.getName());
				counter++;
			} else {
				System.out.println("Failed to rename: " + file.getName());
			}
		}
	}

}
