package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 去标接口返回值
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:51:40
 */
public class RemoveTagResponse extends AlipayObject {

	private static final long serialVersionUID = 7585376475355951389L;

	/**
	 * 批量去标接口结果列表
	 */
	@ApiListField("remove_tag_result")
	@ApiField("remove_tag_result")
	private List<RemoveTagResult> removeTagResult;

	public List<RemoveTagResult> getRemoveTagResult() {
		return this.removeTagResult;
	}
	public void setRemoveTagResult(List<RemoveTagResult> removeTagResult) {
		this.removeTagResult = removeTagResult;
	}

}
