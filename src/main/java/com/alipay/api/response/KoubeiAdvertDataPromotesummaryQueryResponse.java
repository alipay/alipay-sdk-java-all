package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromoteDataModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.data.promotesummary.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-29 15:06:09
 */
public class KoubeiAdvertDataPromotesummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1128329951335949164L;

	/** 
	 * 口碑平台推广数据
	 */
	@ApiField("kb_platform_promote_data")
	private PromoteDataModel kbPlatformPromoteData;

	/** 
	 * 其他推广者推广数据
	 */
	@ApiField("others_promote_data")
	private PromoteDataModel othersPromoteData;

	/** 
	 * 入参时间段内总推广数据
	 */
	@ApiField("part_promote_data")
	private PromoteDataModel partPromoteData;

	/** 
	 * 自己推广数据
	 */
	@ApiField("self_promote_data")
	private PromoteDataModel selfPromoteData;

	/** 
	 * 总推广数据
	 */
	@ApiField("total_promote_data")
	private PromoteDataModel totalPromoteData;

	public void setKbPlatformPromoteData(PromoteDataModel kbPlatformPromoteData) {
		this.kbPlatformPromoteData = kbPlatformPromoteData;
	}
	public PromoteDataModel getKbPlatformPromoteData( ) {
		return this.kbPlatformPromoteData;
	}

	public void setOthersPromoteData(PromoteDataModel othersPromoteData) {
		this.othersPromoteData = othersPromoteData;
	}
	public PromoteDataModel getOthersPromoteData( ) {
		return this.othersPromoteData;
	}

	public void setPartPromoteData(PromoteDataModel partPromoteData) {
		this.partPromoteData = partPromoteData;
	}
	public PromoteDataModel getPartPromoteData( ) {
		return this.partPromoteData;
	}

	public void setSelfPromoteData(PromoteDataModel selfPromoteData) {
		this.selfPromoteData = selfPromoteData;
	}
	public PromoteDataModel getSelfPromoteData( ) {
		return this.selfPromoteData;
	}

	public void setTotalPromoteData(PromoteDataModel totalPromoteData) {
		this.totalPromoteData = totalPromoteData;
	}
	public PromoteDataModel getTotalPromoteData( ) {
		return this.totalPromoteData;
	}

}
