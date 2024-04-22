package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融同步数据采集接口
 *
 * @author auto create
 * @since 1.0, 2019-05-27 09:41:35
 */
public class MybankCreditSceneprodDataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2228196977877971375L;

	/**
	 * 申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/**
	 * STRICT_CHECK,NO_CHECK
严格检验，非严格校验
	 */
	@ApiField("data_config")
	private String dataConfig;

	/**
	 * data_content 是风控需要的用户场景数据，统一采用json格式。不同行业内容不同。目前这个接口为定向服务机构和行业(汽车和物流行业)，不是完全开放的接口。

机构传入org_code和product_code,场景端根据两码和行业映射关系判断行业,从而对传入的场景参数进行校验。

目前只接入汽车行业，下面是汽车行业进件模版地址。
https://yuque.antfin-inc.com/scene/dq09hu/zsr5zx
	 */
	@ApiField("data_content")
	private String dataContent;

	/**
	 * 机构码，接入时场景分配
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 产品码，机构接入时接入
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAppSeqno() {
		return this.appSeqno;
	}
	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}

	public String getDataConfig() {
		return this.dataConfig;
	}
	public void setDataConfig(String dataConfig) {
		this.dataConfig = dataConfig;
	}

	public String getDataContent() {
		return this.dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
