package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TagDistDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.tag.dist.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-18 21:46:52
 */
public class DatadigitalFincloudFinsaasTagDistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3479813713811321943L;

	/** 
	 * 标签取值列表
	 */
	@ApiListField("tag_dist_dto_list")
	@ApiField("tag_dist_d_t_o")
	private List<TagDistDTO> tagDistDtoList;

	public void setTagDistDtoList(List<TagDistDTO> tagDistDtoList) {
		this.tagDistDtoList = tagDistDtoList;
	}
	public List<TagDistDTO> getTagDistDtoList( ) {
		return this.tagDistDtoList;
	}

}
