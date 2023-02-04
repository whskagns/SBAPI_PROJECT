package com.sbapi.project.dto;

import lombok.Data;

/**
 * 회원로그인 요청 DTO
 * @author 조남훈
 *
 */
@Data
public class UserGetLoginDTO {
	
	private String userId;				//로그인 ID
	private String userPwd;				//로그인 암호
	
}