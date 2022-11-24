package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客流总量
 *
 * @author auto create
 * @since 1.0, 2019-10-08 19:04:05
 */
public class CloudbusTotalOdItem extends AlipayObject {

	private static final long serialVersionUID = 8118979343766881566L;

	/**
	 * 返回码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 消息提示
	 */
	@ApiField("message")
	private String message;

	/**
	 * 客流总量值(日均)
	 */
	@ApiField("totalod")
	private Long totalod;

	/**
	 * 周末客流总量(日均)
	 */
	@ApiField("weekend_od")
	private Long weekendOd;

	/**
	 * 工作日客流总量(日均)
	 */
	@ApiField("workday_od")
	private Long workdayOd;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTotalod() {
		return this.totalod;
	}
	public void setTotalod(Long totalod) {
		this.totalod = totalod;
	}

	public Long getWeekendOd() {
		return this.weekendOd;
	}
	public void setWeekendOd(Long weekendOd) {
		this.weekendOd = weekendOd;
	}

	public Long getWorkdayOd() {
		return this.workdayOd;
	}
	public void setWorkdayOd(Long workdayOd) {
		this.workdayOd = workdayOd;
	}

}
