package ��ƽ̨ͼ�����ϵͳ�������;

class BMPImage extends Image{
	public void parseFile(String fileName) {
		Matrix m = new Matrix();
		imp.doPaint(m);;
		System.out.println(fileName + ",��ʽΪBMP.");
	}
}
