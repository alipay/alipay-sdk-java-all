package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联交易下，返回收单机构的信息
 *
 * @author auto create
 * @since 1.0, 2022-10-08 11:07:37
 */
public class BkAgentRespInfo extends AlipayObject {

	private static final long serialVersionUID = 4139364937488429818L;

	/**
	 * 枚举值，01 银联；02 网联；03 连通等
	 */
	@ApiField("bindclrissr_id")
	private String bindclrissrId;

	/**
	 * 付款机构在清算组织登记或分配的机构代码
	 */
	@ApiField("bindpyeracctbk_id")
	private String bindpyeracctbkId;

	/**
	 * 原快捷交易流水号
	 */
	@ApiField("bindtrx_id")
	private String bindtrxId;

	/**
	 * 用户在银行付款账号的标记化处理编号
	 */
	@ApiField("bkpyeruser_code")
	private String bkpyeruserCode;

	/**
	 * 设备推测位置
	 */
	@ApiField("estter_location")
	private String estterLocation;

	public String getBindclrissrId() {
		return this.bindclrissrId;
	}
	public void setBindclrissrId(String bindclrissrId) {
		this.bindclrissrId = bindclrissrId;
	}

	public String getBindpyeracctbkId() {
		return this.bindpyeracctbkId;
	}
	public void setBindpyeracctbkId(String bindpyeracctbkId) {
		this.bindpyeracctbkId = bindpyeracctbkId;
	}

	public String getBindtrxId() {
		return this.bindtrxId;
	}
	public void setBindtrxId(String bindtrxId) {
		this.bindtrxId = bindtrxId;
	}

	public String getBkpyeruserCode() {
		return this.bkpyeruserCode;
	}
	public void setBkpyeruserCode(String bkpyeruserCode) {
		this.bkpyeruserCode = bkpyeruserCode;
	}

	public String getEstterLocation() {
		return this.estterLocation;
	}
	public void setEstterLocation(String estterLocation) {
		this.estterLocation = estterLocation;
	}

}
