package ��ƽ̨ͼ�����ϵͳ�������;

class PGNImage extends Image{
	public void parseFile(String fileName) {
		Matrix m = new Matrix();
		imp.doPaint(m);;
		System.out.println(fileName + ",��ʽΪPGN.");
	}

}
