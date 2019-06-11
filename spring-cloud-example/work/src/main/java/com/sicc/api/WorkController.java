package com.sicc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * work ��Ʈ�ѷ�
 * @author Woongs
 */
@RestController						// RestController ����
@RequestMapping(path = "/works")	// path ���� (http://localhost:8082/works �ν� ���� ����)
public class WorkController {
	
	/**
	 * Work ���� �Լ�
	 * @param workId : ��ũ���̵�
	 * @return ���ڿ�(��ũ���̵�, ���ð�)
	 */
	@RequestMapping(path = "/{workId}", method = RequestMethod.GET) // path ���� (http://localhost:8082/works/xxxx �ν� ���� ����)
	public String getWorkDetail(@PathVariable String workId) {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		return "[work id = "+workId+" at "+System.currentTimeMillis()+"]";
		//return String.format("[work id = %s at %s]", workId, System.currentTimeMillis());
		throw new RuntimeException("I/O ERROR"); // fallback �׽�Ʈ�� ���� �ڵ�
	}
}
