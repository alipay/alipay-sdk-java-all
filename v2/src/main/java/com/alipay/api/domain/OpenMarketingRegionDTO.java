package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 展区信息
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class OpenMarketingRegionDTO extends AlipayObject {

	private static final long serialVersionUID = 1572925411644629477L;

	/**
	 * null
	 */
	@ApiListField("marketing_item_list")
	@ApiField("open_marketing_item_d_t_o")
	private List<OpenMarketingItemDTO> marketingItemList;

	/**
	 * null
	 */
	@ApiListField("region_action_list")
	@ApiField("open_marketing_action_d_t_o")
	private List<OpenMarketingActionDTO> regionActionList;

	/**
	 * 展区背景图片
	 */
	@ApiField("region_bg_pic")
	private String regionBgPic;

	/**
	 * 展区ID
	 */
	@ApiField("region_id")
	private String regionId;

	/**
	 * 展区名称
	 */
	@ApiField("region_name")
	private String regionName;

	/**
	 * 展区位置
	 */
	@ApiField("region_position")
	private String regionPosition;

	public List<OpenMarketingItemDTO> getMarketingItemList() {
		return this.marketingItemList;
	}
	public void setMarketingItemList(List<OpenMarketingItemDTO> marketingItemList) {
		this.marketingItemList = marketingItemList;
	}

	public List<OpenMarketingActionDTO> getRegionActionList() {
		return this.regionActionList;
	}
	public void setRegionActionList(List<OpenMarketingActionDTO> regionActionList) {
		this.regionActionList = regionActionList;
	}

	public String getRegionBgPic() {
		return this.regionBgPic;
	}
	public void setRegionBgPic(String regionBgPic) {
		this.regionBgPic = regionBgPic;
	}

	public String getRegionId() {
		return this.regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return this.regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionPosition() {
		return this.regionPosition;
	}
	public void setRegionPosition(String regionPosition) {
		this.regionPosition = regionPosition;
	}

}
