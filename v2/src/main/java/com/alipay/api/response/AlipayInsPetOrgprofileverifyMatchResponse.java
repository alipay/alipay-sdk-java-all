package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MatchPetList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.pet.orgprofileverify.match response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 15:12:54
 */
public class AlipayInsPetOrgprofileverifyMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3357288476589642648L;

	/** 
	 * 匹配的宠物列表
	 */
	@ApiField("match_pet_list")
	private MatchPetList matchPetList;

	public void setMatchPetList(MatchPetList matchPetList) {
		this.matchPetList = matchPetList;
	}
	public MatchPetList getMatchPetList( ) {
		return this.matchPetList;
	}

}
