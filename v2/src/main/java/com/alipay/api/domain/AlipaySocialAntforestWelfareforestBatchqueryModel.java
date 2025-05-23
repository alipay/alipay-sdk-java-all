package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询公益林列表
 *
 * @author auto create
 * @since 1.0, 2025-02-08 16:28:09
 */
public class AlipaySocialAntforestWelfareforestBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8888384712818449713L;

	/**
	 * 传入公益林业务项目的编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求来源，由森林侧同学定义给出，例如：youku（优酷）
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
