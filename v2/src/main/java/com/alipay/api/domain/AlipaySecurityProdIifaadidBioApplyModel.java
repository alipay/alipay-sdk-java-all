package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券商本地生物身份凭证申请
 *
 * @author auto create
 * @since 1.0, 2025-09-08 10:43:41
 */
public class AlipaySecurityProdIifaadidBioApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6688641984585611246L;

	/**
	 * 业务请求的唯一流水ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * IIFAA为用户设备申请的唯一标识，用户在分布式系统中的身份标识
	 */
	@ApiField("did")
	private String did;

	/**
	 * 用户设备中的环境信息
	 */
	@ApiField("env_data")
	private String envData;

	/**
	 * 用户开通本地生物的安全数据
	 */
	@ApiField("ifaa_msg")
	private String ifaaMsg;

	/**
	 * IIFAA分配的业务场景CODE
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 券商名称
	 */
	@ApiField("stock_name")
	private String stockName;

	/**
	 * 用户唯一交易ID
	 */
	@ApiField("user_trans_id")
	private String userTransId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDid() {
		return this.did;
	}
	public void setDid(String did) {
		this.did = did;
	}

	public String getEnvData() {
		return this.envData;
	}
	public void setEnvData(String envData) {
		this.envData = envData;
	}

	public String getIfaaMsg() {
		return this.ifaaMsg;
	}
	public void setIfaaMsg(String ifaaMsg) {
		this.ifaaMsg = ifaaMsg;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getStockName() {
		return this.stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getUserTransId() {
		return this.userTransId;
	}
	public void setUserTransId(String userTransId) {
		this.userTransId = userTransId;
	}

}
