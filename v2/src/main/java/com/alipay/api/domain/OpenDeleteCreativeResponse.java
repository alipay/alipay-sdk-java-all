package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除创意的响应
 *
 * @author auto create
 * @since 1.0, 2024-07-19 14:36:40
 */
public class OpenDeleteCreativeResponse extends AlipayObject {

	private static final long serialVersionUID = 4878599356991752566L;

	/**
	 * 创意删除失败详情列表
	 */
	@ApiListField("creative_fail_detail_list")
	@ApiField("creative_delete_fail_detail")
	private List<CreativeDeleteFailDetail> creativeFailDetailList;

	/**
	 * 删除成功外部创意id集合
	 */
	@ApiListField("creative_outer_id_success_list")
	@ApiField("string")
	private List<String> creativeOuterIdSuccessList;

	public List<CreativeDeleteFailDetail> getCreativeFailDetailList() {
		return this.creativeFailDetailList;
	}
	public void setCreativeFailDetailList(List<CreativeDeleteFailDetail> creativeFailDetailList) {
		this.creativeFailDetailList = creativeFailDetailList;
	}

	public List<String> getCreativeOuterIdSuccessList() {
		return this.creativeOuterIdSuccessList;
	}
	public void setCreativeOuterIdSuccessList(List<String> creativeOuterIdSuccessList) {
		this.creativeOuterIdSuccessList = creativeOuterIdSuccessList;
	}

}
