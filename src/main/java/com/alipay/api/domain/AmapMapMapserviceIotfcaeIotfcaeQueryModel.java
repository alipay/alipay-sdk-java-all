package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * iotface人脸测试
 *
 * @author auto create
 * @since 1.0, 2022-04-19 15:05:56
 */
public class AmapMapMapserviceIotfcaeIotfcaeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5293666777445957922L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * V型的级别是都是废话是的发布v
	 */
	@ApiField("client_version")
	private String clientVersion;

	/**
	 * dsgsdgfs
	 */
	@ApiListField("skin_id_list")
	@ApiField("string")
	private List<String> skinIdList;

	/**
	 * 是看见的深V恐惧时代华府是东方红是u
	 */
	@ApiListField("tips_collect_rate")
	@ApiField("string")
	private List<String> tipsCollectRate;

	/**
	 * 打算过和女的方式给对方
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getClientVersion() {
		return this.clientVersion;
	}
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public List<String> getSkinIdList() {
		return this.skinIdList;
	}
	public void setSkinIdList(List<String> skinIdList) {
		this.skinIdList = skinIdList;
	}

	public List<String> getTipsCollectRate() {
		return this.tipsCollectRate;
	}
	public void setTipsCollectRate(List<String> tipsCollectRate) {
		this.tipsCollectRate = tipsCollectRate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
