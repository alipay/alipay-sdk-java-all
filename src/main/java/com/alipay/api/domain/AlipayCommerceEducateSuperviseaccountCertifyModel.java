package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构监管专户有效性验证接口
 *
 * @author auto create
 * @since 1.0, 2019-07-31 15:41:46
 */
public class AlipayCommerceEducateSuperviseaccountCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7731641217522719187L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，目前支持类型如下：
营业执照：201,事业单位登记证书：205，社会团体登记证书：204，民办非企业单位证书：202，党政机关批准设计文件：301，全国组织机构代码证书：206
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 企业账户邮箱账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 教育局ID，用于标注不同地区的教育局，如330100（杭州市教育局）使用2019年3月版本国标市区码：http://www.mca.gov.cn/article/sj/xzqh/2019/201901-06/201904301706.html
	 */
	@ApiField("supervise_id")
	private String superviseId;

	/**
	 * 监管类型，固定为EDU_TRAIN
	 */
	@ApiField("supervise_type")
	private String superviseType;

	/**
	 * 企业账户名称，与证件名称一致
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getSuperviseId() {
		return this.superviseId;
	}
	public void setSuperviseId(String superviseId) {
		this.superviseId = superviseId;
	}

	public String getSuperviseType() {
		return this.superviseType;
	}
	public void setSuperviseType(String superviseType) {
		this.superviseType = superviseType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
