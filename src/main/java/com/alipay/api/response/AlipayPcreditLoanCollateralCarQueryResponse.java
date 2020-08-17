package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.collateral.car.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditLoanCollateralCarQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8465561776324911671L;

	/** 
	 * 用户常住地，参考标准的行政区域编号（http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/），如：
330100表示杭州市
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 业务流水号，即用户授信申请的单号，每次授信申请由借呗平台生成的唯一编号，通知估值时给到机构
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 车辆品牌标识，合作机构提供的车型库，如：
1表示奥迪
	 */
	@ApiField("car_brand_id")
	private String carBrandId;

	/** 
	 * 车辆颜色（中文），合作机构提供的颜色范围，如：
米色，棕色，金色，紫色，巧克力色，黑色，蓝色，灰色，绿色，红色，橙色，白色，香槟色，银色，黄色
	 */
	@ApiField("car_color")
	private String carColor;

	/** 
	 * 发动机号
	 */
	@ApiField("car_engine_no")
	private String carEngineNo;

	/** 
	 * 行驶里程数，单位：公里
	 */
	@ApiField("car_mileage")
	private Long carMileage;

	/** 
	 * 车型标识，合作机构提供的车型库，如：
1127895表示2017款 奥迪A8L A8L 45 TFSI quattro舒适型
	 */
	@ApiField("car_model_id")
	private String carModelId;

	/** 
	 * 车辆注册日期（行驶证上注册时间），格式：yyyy-MM-dd
	 */
	@ApiField("car_reg_date")
	private String carRegDate;

	/** 
	 * 车系标识，合作机构提供的车型库，如：
10表示奥迪A8L
	 */
	@ApiField("car_series_id")
	private String carSeriesId;

	/** 
	 * 车架号（Vehicle Identification Number，车辆识别代码）
	 */
	@ApiField("car_vin")
	private String carVin;

	/** 
	 * 证件号，查询接口仅提供加密串，算法双方约定
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，和证件号cert_no配合使用，由平台定义，目前支持的证件类型有：
IDENTITY_CARD-身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 押品录入时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("created_time")
	private String createdTime;

	/** 
	 * 上牌地，合作机构提供支持办理贷款的省市，参考标准的行政区域编号（http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/），如：
330100表示杭州市
	 */
	@ApiField("lic_plate_address")
	private String licPlateAddress;

	/** 
	 * 车牌号
	 */
	@ApiField("lic_plate_no")
	private String licPlateNo;

	/** 
	 * 客户姓名
	 */
	@ApiField("name")
	private String name;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setCarBrandId(String carBrandId) {
		this.carBrandId = carBrandId;
	}
	public String getCarBrandId( ) {
		return this.carBrandId;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarColor( ) {
		return this.carColor;
	}

	public void setCarEngineNo(String carEngineNo) {
		this.carEngineNo = carEngineNo;
	}
	public String getCarEngineNo( ) {
		return this.carEngineNo;
	}

	public void setCarMileage(Long carMileage) {
		this.carMileage = carMileage;
	}
	public Long getCarMileage( ) {
		return this.carMileage;
	}

	public void setCarModelId(String carModelId) {
		this.carModelId = carModelId;
	}
	public String getCarModelId( ) {
		return this.carModelId;
	}

	public void setCarRegDate(String carRegDate) {
		this.carRegDate = carRegDate;
	}
	public String getCarRegDate( ) {
		return this.carRegDate;
	}

	public void setCarSeriesId(String carSeriesId) {
		this.carSeriesId = carSeriesId;
	}
	public String getCarSeriesId( ) {
		return this.carSeriesId;
	}

	public void setCarVin(String carVin) {
		this.carVin = carVin;
	}
	public String getCarVin( ) {
		return this.carVin;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	public String getCertType( ) {
		return this.certType;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	public String getCreatedTime( ) {
		return this.createdTime;
	}

	public void setLicPlateAddress(String licPlateAddress) {
		this.licPlateAddress = licPlateAddress;
	}
	public String getLicPlateAddress( ) {
		return this.licPlateAddress;
	}

	public void setLicPlateNo(String licPlateNo) {
		this.licPlateNo = licPlateNo;
	}
	public String getLicPlateNo( ) {
		return this.licPlateNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
