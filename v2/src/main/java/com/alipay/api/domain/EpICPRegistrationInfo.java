package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业ICP备案明细
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:26:32
 */
public class EpICPRegistrationInfo extends AlipayObject {

	private static final long serialVersionUID = 1271485382172293485L;

	/**
	 * 网站域名
	 */
	@ApiListField("domain_name")
	@ApiField("string")
	private List<String> domainName;

	/**
	 * 审核通过时间
	 */
	@ApiField("shtgsj")
	private String shtgsj;

	/**
	 * 网站名称
	 */
	@ApiField("web_name")
	private String webName;

	/**
	 * 网站备案/许可证号
	 */
	@ApiField("wzbaxkzh")
	private String wzbaxkzh;

	/**
	 * 主办单位名称
	 */
	@ApiField("zbdwmc")
	private String zbdwmc;

	public List<String> getDomainName() {
		return this.domainName;
	}
	public void setDomainName(List<String> domainName) {
		this.domainName = domainName;
	}

	public String getShtgsj() {
		return this.shtgsj;
	}
	public void setShtgsj(String shtgsj) {
		this.shtgsj = shtgsj;
	}

	public String getWebName() {
		return this.webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}

	public String getWzbaxkzh() {
		return this.wzbaxkzh;
	}
	public void setWzbaxkzh(String wzbaxkzh) {
		this.wzbaxkzh = wzbaxkzh;
	}

	public String getZbdwmc() {
		return this.zbdwmc;
	}
	public void setZbdwmc(String zbdwmc) {
		this.zbdwmc = zbdwmc;
	}

}
