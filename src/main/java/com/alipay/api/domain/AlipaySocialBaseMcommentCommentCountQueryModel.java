package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 微动态对象摘要信息查询接口
 *
 * @author auto create
 * @since 1.0, 2016-11-13 14:31:43
 */
public class AlipaySocialBaseMcommentCommentCountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6243952188828936946L;

	/**
	 * 被评论对象的ID，支持最多n个对象批量查询（n<=20）
	 */
	@ApiListField("target_ids")
	@ApiField("string")
	private List<String> targetIds;

	public List<String> getTargetIds() {
		return this.targetIds;
	}
	public void setTargetIds(List<String> targetIds) {
		this.targetIds = targetIds;
	}

}
