package com.sicc.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Member ��Ʈ�ѷ�
 * @author Woongs
 */
@RestController						// RestController ����
@RequestMapping(path = "/members")	// path ���� (http://localhost:8081/members �ν� ���� ����)
public class MemberController {

	/**
	 * Member ���� �Լ�
	 * @param memberId : ������̵�
	 * @return ���ڿ�(������̵�, ���ð�, work����)
	 */
    @GetMapping(path = "/{memberId}") // path ���� (http://localhost:8081/members/xxxx �ν� ���� ����)
    public String getMemberDetail(@PathVariable String memberId) {
        String workInfo = "[unknown]";
        return String.format("[display id = %s at %s %s ]", memberId, System.currentTimeMillis(), workInfo);
    }
}