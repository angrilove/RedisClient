package com.cxy.redisclient;

import com.cxy.redisclient.domain.ContainerKey;
import com.cxy.redisclient.service.ExportService;
import junit.framework.TestCase;

import java.io.IOException;

public class ExportTest extends TestCase {

	public void testExport() throws IOException {
		ExportService service = new ExportService("C:\\Users\\xinyu\\Desktop\\export", 5, 7, new ContainerKey(""));
		service.export();
	}

}
