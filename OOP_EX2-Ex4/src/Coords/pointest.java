package Coords;

import Algorithms.MultiCsv;
import File_format.CsvParser;
import GIS.GisLayer;
import GIS.GisMetaData;
import GIS.GisProject;
import Geom.Point3D;

public class pointest {
	public static void main (String[]args) throws Exception {

		String csv ="C:\\Users\\user\\Desktop\\test";
     	MultiCsv mult= new MultiCsv(csv);
		GisProject project = mult.getProject();
		project.ProjectToKml("C:\\Users\\user\\Desktop\\test\\tese.kml");
    	System.out.println(project);
//		GisLayer layer_1= new GisLayer("C:\\Users\\Simple Man\\Desktop\\test\\123.csv");
//		GisLayer layer_2= new GisLayer("C:\\Users\\Simple Man\\Desktop\\ex2\\WigleWifi_20171201110209.csv");
//		System.out.println(project);
//		System.out.println(project.add(layer_1));
//		project.add(layer_2);
//		System.out.println(project);
	}
}
