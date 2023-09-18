package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 档口关联的kds信息
 *
 * @author auto create
 * @since 1.0, 2018-12-20 22:03:15
 */
public class StallKdsEntity extends AlipayObject {

	private static final long serialVersionUID = 4296474754934747658L;

	/**
	 * 订单来源 枚举 默认all
	 */
	@ApiField("dinner_type")
	private String dinnerType;

	/**
	 * kds id
	 */
	@ApiField("kds_id")
	private String kdsId;

	/**
	 * kds名称
	 */
	@ApiField("kds_name")
	private String kdsName;

	/**
	 * kds类型 ： 制作屏，备餐屏 ， 取餐屏
	 */
	@ApiField("kds_type")
	private String kdsType;

	/**
	 * 0-不打印 ，1-打印 ， 默认 0
	 */
	@ApiField("print_flag")
	private String printFlag;

	/**
	 * 打印机 Id
	 */
	@ApiField("printer_id")
	private String printerId;

	public String getDinnerType() {
		return this.dinnerType;
	}
	public void setDinnerType(String dinnerType) {
		this.dinnerType = dinnerType;
	}

	public String getKdsId() {
		return this.kdsId;
	}
	public void setKdsId(String kdsId) {
		this.kdsId = kdsId;
	}

	public String getKdsName() {
		return this.kdsName;
	}
	public void setKdsName(String kdsName) {
		this.kdsName = kdsName;
	}

	public String getKdsType() {
		return this.kdsType;
	}
	public void setKdsType(String kdsType) {
		this.kdsType = kdsType;
	}

	public String getPrintFlag() {
		return this.printFlag;
	}
	public void setPrintFlag(String printFlag) {
		this.printFlag = printFlag;
	}

	public String getPrinterId() {
		return this.printerId;
	}
	public void setPrinterId(String printerId) {
		this.printerId = printerId;
	}

}
