package com.sicc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Work ������Ʈ ȣ�� �������̽� ����
 * @author Woongs
 */
@Service
public class WorkRemoteServiceImpl implements WorkRemoteService {

	public static final String URL = "http://localhost:8082/works/"; // ��û�� URL �ּ�
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String getWorkInfo(String workId) {
		return restTemplate.getForObject(URL+workId, String.class); // work������Ʈ�� URL�� ���� Object������ ������
	}

}
