package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试文档更新
 *
 * @author auto create
 * @since 1.0, 2020-02-04 19:47:26
 */
public class AlipayOpenAppDfsfasDeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3636447338373534398L;

	/**
	 * 1
	 */
	@ApiField("desd")
	private String desd;

	/**
	 * 1
	 */
	@ApiField("desdde")
	private String desdde;

	/**
	 * 1
	 */
	@ApiField("desf")
	private String desf;

	public String getDesd() {
		return this.desd;
	}
	public void setDesd(String desd) {
		this.desd = desd;
	}

	public String getDesdde() {
		return this.desdde;
	}
	public void setDesdde(String desdde) {
		this.desdde = desdde;
	}

	public String getDesf() {
		return this.desf;
	}
	public void setDesf(String desf) {
		this.desf = desf;
	}

}
