package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MatchedMemberDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.archive.member.match response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-27 15:56:19
 */
public class AlipayCommerceMedicalArchiveMemberMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 3687524178519529467L;

	/** 
	 * true-匹配到的档案成员为本人；
false-未匹配到本人

当匹配到本人
	 */
	@ApiField("is_matched_self")
	private Boolean isMatchedSelf;

	/** 
	 * null
	 */
	@ApiListField("matched_member_list")
	@ApiField("matched_member_d_t_o")
	private List<MatchedMemberDTO> matchedMemberList;

	public void setIsMatchedSelf(Boolean isMatchedSelf) {
		this.isMatchedSelf = isMatchedSelf;
	}
	public Boolean getIsMatchedSelf( ) {
		return this.isMatchedSelf;
	}

	public void setMatchedMemberList(List<MatchedMemberDTO> matchedMemberList) {
		this.matchedMemberList = matchedMemberList;
	}
	public List<MatchedMemberDTO> getMatchedMemberList( ) {
		return this.matchedMemberList;
	}

}
