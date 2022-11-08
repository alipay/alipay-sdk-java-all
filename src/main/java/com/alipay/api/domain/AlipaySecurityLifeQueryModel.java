package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源化停用启用调用资源全链路测试
 *
 * @author auto create
 * @since 1.0, 2022-07-20 15:41:48
 */
public class AlipaySecurityLifeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3724671529233526294L;

	/**
	 * asfsdf
	 */
	@ApiListField("dsfg")
	@ApiField("ape_rec_context")
	private List<ApeRecContext> dsfg;

	/**
	 * sdegdfg
	 */
	@ApiListField("grt")
	@ApiField("string")
	private List<String> grt;

	/**
	 * sfdsfdsfsdf
	 */
	@ApiField("hh")
	private Boolean hh;

	/**
	 * dfgdfgdf
	 */
	@ApiListField("sdgd")
	@ApiField("date")
	private List<Date> sdgd;

	/**
	 * 手动的
	 */
	@ApiField("xcvb")
	private String xcvb;

	public List<ApeRecContext> getDsfg() {
		return this.dsfg;
	}
	public void setDsfg(List<ApeRecContext> dsfg) {
		this.dsfg = dsfg;
	}

	public List<String> getGrt() {
		return this.grt;
	}
	public void setGrt(List<String> grt) {
		this.grt = grt;
	}

	public Boolean getHh() {
		return this.hh;
	}
	public void setHh(Boolean hh) {
		this.hh = hh;
	}

	public List<Date> getSdgd() {
		return this.sdgd;
	}
	public void setSdgd(List<Date> sdgd) {
		this.sdgd = sdgd;
	}

	public String getXcvb() {
		return this.xcvb;
	}
	public void setXcvb(String xcvb) {
		this.xcvb = xcvb;
	}

}
