package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 驳回原因列表
 *
 * @author auto create
 * @since 1.0, 2022-07-13 11:56:02
 */
public class MiniAppAuditReasonMemo extends AlipayObject {

	private static final long serialVersionUID = 7396456922465859876L;

	/**
	 * 驳回原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 规则图片链接
	 */
	@ApiListField("memo_image_list")
	@ApiField("string")
	private List<String> memoImageList;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<String> getMemoImageList() {
		return this.memoImageList;
	}
	public void setMemoImageList(List<String> memoImageList) {
		this.memoImageList = memoImageList;
	}

}
