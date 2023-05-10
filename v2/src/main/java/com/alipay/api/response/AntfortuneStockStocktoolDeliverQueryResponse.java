package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StockPositionVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.stocktool.deliver.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 05:41:49
 */
public class AntfortuneStockStocktoolDeliverQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7549655325985567693L;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 展位准入列表
	 */
	@ApiListField("position_list")
	@ApiField("stock_position_v_o")
	private List<StockPositionVO> positionList;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setPositionList(List<StockPositionVO> positionList) {
		this.positionList = positionList;
	}
	public List<StockPositionVO> getPositionList( ) {
		return this.positionList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
