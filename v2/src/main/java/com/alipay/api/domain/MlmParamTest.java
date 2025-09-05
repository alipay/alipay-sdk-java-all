package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MlmParamTest
 *
 * @author auto create
 * @since 1.0, 2023-11-16 10:36:40
 */
public class MlmParamTest extends AlipayObject {

	private static final long serialVersionUID = 5663769624969121113L;

	/**
	 * 参数
	 */
	@ApiField("param_mlm_a")
	private String paramMlmA;

	/**
	 * 描述number
	 */
	@ApiField("param_mlm_b")
	private Long paramMlmB;

	/**
	 * null
	 */
	@ApiField("param_mlm_c")
	private Boolean paramMlmC;

	/**
	 * date描述
	 */
	@ApiField("param_mlm_d")
	private Date paramMlmD;

	/**
	 * price描述
	 */
	@ApiField("param_mlm_e")
	private String paramMlmE;

	public String getParamMlmA() {
		return this.paramMlmA;
	}
	public void setParamMlmA(String paramMlmA) {
		this.paramMlmA = paramMlmA;
	}

	public Long getParamMlmB() {
		return this.paramMlmB;
	}
	public void setParamMlmB(Long paramMlmB) {
		this.paramMlmB = paramMlmB;
	}

	public Boolean getParamMlmC() {
		return this.paramMlmC;
	}
	public void setParamMlmC(Boolean paramMlmC) {
		this.paramMlmC = paramMlmC;
	}

	public Date getParamMlmD() {
		return this.paramMlmD;
	}
	public void setParamMlmD(Date paramMlmD) {
		this.paramMlmD = paramMlmD;
	}

	public String getParamMlmE() {
		return this.paramMlmE;
	}
	public void setParamMlmE(String paramMlmE) {
		this.paramMlmE = paramMlmE;
	}

}
