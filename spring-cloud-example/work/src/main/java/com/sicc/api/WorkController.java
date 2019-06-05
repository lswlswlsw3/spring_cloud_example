package com.sicc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@GetMapping(path = "/{workId}") // path ���� (http://localhost:8082/works/xxxx �ν� ���� ����)
	public String getWorkDetail(@PathVariable String workId) {
		return String.format("[work id = %s at %s]", workId, System.currentTimeMillis());
	}
}
