package com.oshiro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.PDF417Writer;
import com.google.zxing.qrcode.QRCodeWriter;

public class TestZxing {

	public static void main(String[] args) throws WriterException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		String path = "D:\\Oshiro\\Sunat\\Code QR - PDF417\\example_codeQR.png";
		
		BitMatrix bitMatrix;
		Writer writer = new QRCodeWriter();
		
		bitMatrix = writer.encode("http://joshiro.xyz/", BarcodeFormat.QR_CODE, 200, 200);
		MatrixToImageWriter.writeToStream(bitMatrix, "png", new FileOutputStream(new File(path)));	
		
		System.out.println("Generando codigo QR ....");
		
		path = "D:\\Oshiro\\Sunat\\Code QR - PDF417\\example_pdf417.png";
		
		writer = new PDF417Writer();
		bitMatrix = writer.encode("http://joshiro.xyz/", BarcodeFormat.PDF_417, 150, 50);
		MatrixToImageWriter.writeToStream(bitMatrix, "png", new FileOutputStream(new File(path)));	
		
		System.out.println("Generando codigo PDF417 ....");
		
	}

}
