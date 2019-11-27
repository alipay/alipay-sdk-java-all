package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融信息上传接口
 *
 * @author auto create
 * @since 1.0, 2019-05-05 17:32:35
 */
public class MybankCreditSceneprodInfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4253837684874621756L;

	/**
	 * 申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/**
	 * 信息上送的分类
	 */
	@ApiField("category")
	private String category;

	public String getAppSeqno() {
		return this.appSeqno;
	}
	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
