package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 池融资额度查询
 *
 * @author auto create
 * @since 1.0, 2020-09-15 10:34:08
 */
public class AnttechBlockchainFinancePfQuotaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1894672296574487532L;

	/**
	 * 客户号
	 */
	@ApiField("client_no")
	private String clientNo;

	/**
	 * 证件类型
	 */
	@ApiField("crf_type")
	private String crfType;

	/**
	 * 证件号
	 */
	@ApiField("id_num")
	private String idNum;

	/**
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/**
	 * 平台号
	 */
	@ApiField("platform_id")
	private String platformId;

	public String getClientNo() {
		return this.clientNo;
	}
	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	public String getCrfType() {
		return this.crfType;
	}
	public void setCrfType(String crfType) {
		this.crfType = crfType;
	}

	public String getIdNum() {
		return this.idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getParm() {
		return this.parm;
	}
	public void setParm(String parm) {
		this.parm = parm;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
