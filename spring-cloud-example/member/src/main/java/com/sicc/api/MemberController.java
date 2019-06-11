package com.sicc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sicc.service.FeignWorkRemoteService;
import com.sicc.service.WorkRemoteService;

/**
 * Member ��Ʈ�ѷ�
 * @author Woongs
 */
@RestController						// RestController ����
@RequestMapping(path = "/members")	// path ���� (http://localhost:8081/members �ν� ���� ����)
public class MemberController {
	
	@Autowired
	FeignWorkRemoteService feignWorkRemoteService; // feign ���� ����� ���� �߰�
	
	@Autowired
	WorkRemoteService workRemoteService;
		
	/**
	 * Member ���� �Լ�
	 * @param memberId : ������̵�
	 * @return ���ڿ�(������̵�, ���ð�, work����)
	 */
    @GetMapping(path = "/{memberId}") // path ���� (http://localhost:8081/members/xxxx �ν� ���� ����)
    public String getMemberDetail(@PathVariable String memberId) {
        //String workInfo = workRemoteService.getWorkInfo("999");
    	String workInfo = getWorkInfo();
        return String.format("[member id = %s at %s %s ]", memberId, System.currentTimeMillis(), workInfo);
    }
    
    /**
     * feign��� work ���� �Լ�
     * @return ����
     */
    private String getWorkInfo() {
    	return feignWorkRemoteService.getWorkInfo("12345");
    }
}