package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppCustomGrayGroupDto;
import com.alipay.api.domain.MiniAppCustomGrayMemberInfoDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.customgray.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 18:41:58
 */
public class AlipayOpenMiniInnerversionCustomgrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2544952763854961962L;

	/** 
	 * 灰度分组列表
	 */
	@ApiField("gray_groups")
	private MiniAppCustomGrayGroupDto grayGroups;

	/** 
	 * 灰度用户信息列表
	 */
	@ApiListField("member_infos")
	@ApiField("mini_app_custom_gray_member_info_dto")
	private List<MiniAppCustomGrayMemberInfoDto> memberInfos;

	/** 
	 * 总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setGrayGroups(MiniAppCustomGrayGroupDto grayGroups) {
		this.grayGroups = grayGroups;
	}
	public MiniAppCustomGrayGroupDto getGrayGroups( ) {
		return this.grayGroups;
	}

	public void setMemberInfos(List<MiniAppCustomGrayMemberInfoDto> memberInfos) {
		this.memberInfos = memberInfos;
	}
	public List<MiniAppCustomGrayMemberInfoDto> getMemberInfos( ) {
		return this.memberInfos;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
