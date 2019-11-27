package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建或者删除广告内容时的请求参数
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:40:55
 */
public class KbAdvertSpecialAdvContentRequest extends AlipayObject {

	private static final long serialVersionUID = 3624463879157444749L;

	/**
	 * 红包口令模型，创建红包口令时传入该模型
	 */
	@ApiField("content_password_modify")
	private KbAdvertContentPasswordModify contentPasswordModify;

	/**
	 * 吱口令创建参数
	 */
	@ApiField("content_share_code_modify")
	private KbAdvertContentShareCodeModify contentShareCodeModify;

	/**
	 * 广告内容类型；
passwordRed:红包口令
shareCode：吱口令
1、如果为删除，只要设置content_type，无需设置下面的内容，如果新建，则必须设置内容参数
2、当值是passwordRed时，表示修改口令红包，需要传入content_password_modify模型的参数；
	 */
	@ApiField("content_type")
	private String contentType;

	public KbAdvertContentPasswordModify getContentPasswordModify() {
		return this.contentPasswordModify;
	}
	public void setContentPasswordModify(KbAdvertContentPasswordModify contentPasswordModify) {
		this.contentPasswordModify = contentPasswordModify;
	}

	public KbAdvertContentShareCodeModify getContentShareCodeModify() {
		return this.contentShareCodeModify;
	}
	public void setContentShareCodeModify(KbAdvertContentShareCodeModify contentShareCodeModify) {
		this.contentShareCodeModify = contentShareCodeModify;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
