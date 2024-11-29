package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告系统创建或者删除广告内容时的请求参数
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:46
 */
public class KbAdvertSpecialAdvContentRequest extends AlipayObject {

	private static final long serialVersionUID = 5221834596274262844L;

	/**
	 * 红包口令模型，创建红包口令时传入该模型
	 */
	@ApiField("content_password_modify")
	private KbAdvertContentPasswordModify contentPasswordModify;

	/**
	 * 广告内容类型；
当值是passwordRed时，表示修改口令红包，需要传入content_password_modify模型的参数；
	 */
	@ApiField("content_type")
	private String contentType;

	public KbAdvertContentPasswordModify getContentPasswordModify() {
		return this.contentPasswordModify;
	}
	public void setContentPasswordModify(KbAdvertContentPasswordModify contentPasswordModify) {
		this.contentPasswordModify = contentPasswordModify;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
