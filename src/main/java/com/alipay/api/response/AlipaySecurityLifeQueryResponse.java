package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApeRecContext;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.life.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-20 15:46:44
 */
public class AlipaySecurityLifeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1537259313322214819L;

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
	@ApiListField("hh")
	@ApiField("boolean")
	private List<Boolean> hh;

	/** 
	 * dvf
	 */
	@ApiField("jsdfjsd")
	private String jsdfjsd;

	/** 
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * dfgdfgdf
	 */
	@ApiListField("sdgd")
	@ApiField("date")
	private List<Date> sdgd;

	public void setDsfg(List<ApeRecContext> dsfg) {
		this.dsfg = dsfg;
	}
	public List<ApeRecContext> getDsfg( ) {
		return this.dsfg;
	}

	public void setGrt(List<String> grt) {
		this.grt = grt;
	}
	public List<String> getGrt( ) {
		return this.grt;
	}

	public void setHh(List<Boolean> hh) {
		this.hh = hh;
	}
	public List<Boolean> getHh( ) {
		return this.hh;
	}

	public void setJsdfjsd(String jsdfjsd) {
		this.jsdfjsd = jsdfjsd;
	}
	public String getJsdfjsd( ) {
		return this.jsdfjsd;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setSdgd(List<Date> sdgd) {
		this.sdgd = sdgd;
	}
	public List<Date> getSdgd( ) {
		return this.sdgd;
	}

}
