package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兼职平台贴子年龄
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:14
 */
public class EduAgeDemand extends AlipayObject {

	private static final long serialVersionUID = 8872947949295479942L;

	/**
	 * 结束年龄
	 */
	@ApiField("age_end")
	private String ageEnd;

	/**
	 * 开始年龄
	 */
	@ApiField("age_start")
	private String ageStart;

	public String getAgeEnd() {
		return this.ageEnd;
	}
	public void setAgeEnd(String ageEnd) {
		this.ageEnd = ageEnd;
	}

	public String getAgeStart() {
		return this.ageStart;
	}
	public void setAgeStart(String ageStart) {
		this.ageStart = ageStart;
	}

}
