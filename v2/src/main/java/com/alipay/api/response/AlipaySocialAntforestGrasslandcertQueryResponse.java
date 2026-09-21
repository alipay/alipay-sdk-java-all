package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GrasslandCertDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.grasslandcert.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 15:22:27
 */
public class AlipaySocialAntforestGrasslandcertQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6766831126139341726L;

	/** 
	 * null
	 */
	@ApiListField("grassland_cert_detail_list")
	@ApiField("grassland_cert_detail")
	private List<GrasslandCertDetail> grasslandCertDetailList;

	/** 
	 * true：有下一页
false：没有下一页
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 下一页的游标
	 */
	@ApiField("next_cursor")
	private String nextCursor;

	public void setGrasslandCertDetailList(List<GrasslandCertDetail> grasslandCertDetailList) {
		this.grasslandCertDetailList = grasslandCertDetailList;
	}
	public List<GrasslandCertDetail> getGrasslandCertDetailList( ) {
		return this.grasslandCertDetailList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setNextCursor(String nextCursor) {
		this.nextCursor = nextCursor;
	}
	public String getNextCursor( ) {
		return this.nextCursor;
	}

}
