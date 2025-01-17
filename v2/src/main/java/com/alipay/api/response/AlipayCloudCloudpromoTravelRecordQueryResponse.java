package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PoiRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.travel.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-08 15:27:25
 */
public class AlipayCloudCloudpromoTravelRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7526235222387137256L;

	/** 
	 * 沪小游
	 */
	@ApiField("logo")
	private String logo;

	/** 
	 * null
	 */
	@ApiListField("poi_list")
	@ApiField("poi_record")
	private List<PoiRecord> poiList;

	/** 
	 * 分享记录
	 */
	@ApiField("share_desc")
	private String shareDesc;

	/** 
	 * 东方明珠
	 */
	@ApiField("title")
	private String title;

	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLogo( ) {
		return this.logo;
	}

	public void setPoiList(List<PoiRecord> poiList) {
		this.poiList = poiList;
	}
	public List<PoiRecord> getPoiList( ) {
		return this.poiList;
	}

	public void setShareDesc(String shareDesc) {
		this.shareDesc = shareDesc;
	}
	public String getShareDesc( ) {
		return this.shareDesc;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
