package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 媒体实时上传音频流接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:17
 */
public class AlipayMsaasMediarecogVoiceMediaaudioUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1337247188393284551L;

	/**
	 * base64编码的声音数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_a")
	private String extinfoA;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_b")
	private String extinfoB;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_c")
	private String extinfoC;

	/**
	 * 扩展字段
	 */
	@ApiField("extinfo_d")
	private String extinfoD;

	/**
	 * 时间戳
	 */
	@ApiField("labeltime")
	private String labeltime;

	/**
	 * 媒体名称
	 */
	@ApiField("vname")
	private String vname;

	/**
	 * 媒体类型
	 */
	@ApiField("vtype")
	private String vtype;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getExtinfoA() {
		return this.extinfoA;
	}
	public void setExtinfoA(String extinfoA) {
		this.extinfoA = extinfoA;
	}

	public String getExtinfoB() {
		return this.extinfoB;
	}
	public void setExtinfoB(String extinfoB) {
		this.extinfoB = extinfoB;
	}

	public String getExtinfoC() {
		return this.extinfoC;
	}
	public void setExtinfoC(String extinfoC) {
		this.extinfoC = extinfoC;
	}

	public String getExtinfoD() {
		return this.extinfoD;
	}
	public void setExtinfoD(String extinfoD) {
		this.extinfoD = extinfoD;
	}

	public String getLabeltime() {
		return this.labeltime;
	}
	public void setLabeltime(String labeltime) {
		this.labeltime = labeltime;
	}

	public String getVname() {
		return this.vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVtype() {
		return this.vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

}
