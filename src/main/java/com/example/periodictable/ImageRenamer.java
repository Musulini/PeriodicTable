package com.example.periodictable;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ImageRenamer {

	public static void main(String[] args) {
		String folderPath = "C:\\Users\\gtzlo\\Documents\\Tec\\Cuarto Semestre\\Topicos\\Ejercicios Fx\\PeriodicTable\\src\\main\\resources\\com\\example\\periodictable\\ElementImages"; // Cambia esta ruta a tu carpeta
		File folder = new File(folderPath);
		File[] files = folder.listFiles((dir, name) -> name.toLowerCase().matches(".*\\.(jpg|png|jpeg|gif|bmp)"));

		if (files == null || files.length == 0) {
			System.out.println("No images found.");
			return;
		}

		for (File file : files) {
			String fileName = file.getName();
			String newFileName = fileName.replace("-removebg-preview", ""); // Quita el texto no deseado

			// Si el nombre cambió, renombrar el archivo
			if (!fileName.equals(newFileName)) {
				Path source = file.toPath();
				Path target = new File(folder, newFileName).toPath();

				try {
					Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
					System.out.println("Renamed: " + fileName + " -> " + newFileName);
				} catch (Exception e) {
					System.out.println("Failed to rename: " + fileName);
					e.printStackTrace();
				}
			}
		}
	}

}
