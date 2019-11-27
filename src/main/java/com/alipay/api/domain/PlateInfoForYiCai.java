package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 板块信息
 *
 * @author auto create
 * @since 1.0, 2019-09-26 11:57:33
 */
public class PlateInfoForYiCai extends AlipayObject {

	private static final long serialVersionUID = 4415425946776678826L;

	/**
	 * 板块所属类型,10表示概念板块,20表示地域板块,30表示行业板块
	 */
	@ApiField("category")
	private String category;

	/**
	 * 切换前：板块id；切换后：板块编码
	 */
	@ApiField("id")
	private String id;

	/**
	 * 第一次接入源的板块id。如概念板块[盐湖提锂]，第一次接入选股宝，id为XGB_1967310；后面切源至财联社，id为cls80093，那么财联社cls80093对应的init_plate_id就为XGB_1967310
	 */
	@ApiField("init_plate_id")
	private String initPlateId;

	/**
	 * 板块名称
	 */
	@ApiField("plate_name")
	private String plateName;

	/**
	 * 股票代码和股票名称，中间以空格分开
	 */
	@ApiListField("symbol_name")
	@ApiField("string")
	private List<String> symbolName;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getInitPlateId() {
		return this.initPlateId;
	}
	public void setInitPlateId(String initPlateId) {
		this.initPlateId = initPlateId;
	}

	public String getPlateName() {
		return this.plateName;
	}
	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}

	public List<String> getSymbolName() {
		return this.symbolName;
	}
	public void setSymbolName(List<String> symbolName) {
		this.symbolName = symbolName;
	}

}
