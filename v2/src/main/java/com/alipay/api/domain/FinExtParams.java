package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 传递给金融网络业务扩展信息
 *
 * @author auto create
 * @since 1.0, 2021-03-18 15:52:47
 */
public class FinExtParams extends AlipayObject {

	private static final long serialVersionUID = 6117374696623889244L;

	/**
	 * 机构的appid
	 */
	@ApiField("inst_appid")
	private String instAppid;

	/**
	 * isv编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 返回的url
	 */
	@ApiField("page_return_url")
	private String pageReturnUrl;

	/**
	 * 订单来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 超时时间
	 */
	@ApiField("time_expire")
	private String timeExpire;

	public String getInstAppid() {
		return this.instAppid;
	}
	public void setInstAppid(String instAppid) {
		this.instAppid = instAppid;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getPageReturnUrl() {
		return this.pageReturnUrl;
	}
	public void setPageReturnUrl(String pageReturnUrl) {
		this.pageReturnUrl = pageReturnUrl;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

}
