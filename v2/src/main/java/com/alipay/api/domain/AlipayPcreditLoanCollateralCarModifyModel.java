package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 押品信息更新
 *
 * @author auto create
 * @since 1.0, 2018-07-18 10:46:32
 */
public class AlipayPcreditLoanCollateralCarModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1453759269387982398L;

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
	 * 车辆品牌名称，合作机构提供的车型库
	 */
	@ApiField("car_brand_name")
	private String carBrandName;

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
	 * 车型名称，合作机构提供的车型库
	 */
	@ApiField("car_model_name")
	private String carModelName;

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
	 * 车系名称，合作机构提供的车型库
	 */
	@ApiField("car_series_name")
	private String carSeriesName;

	/**
	 * 车架号（Vehicle Identification Number，车辆识别代码）
	 */
	@ApiField("car_vin")
	private String carVin;

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
	 * 机构请求流水号，请求的幂等字段，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCarBrandId() {
		return this.carBrandId;
	}
	public void setCarBrandId(String carBrandId) {
		this.carBrandId = carBrandId;
	}

	public String getCarBrandName() {
		return this.carBrandName;
	}
	public void setCarBrandName(String carBrandName) {
		this.carBrandName = carBrandName;
	}

	public String getCarColor() {
		return this.carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarEngineNo() {
		return this.carEngineNo;
	}
	public void setCarEngineNo(String carEngineNo) {
		this.carEngineNo = carEngineNo;
	}

	public Long getCarMileage() {
		return this.carMileage;
	}
	public void setCarMileage(Long carMileage) {
		this.carMileage = carMileage;
	}

	public String getCarModelId() {
		return this.carModelId;
	}
	public void setCarModelId(String carModelId) {
		this.carModelId = carModelId;
	}

	public String getCarModelName() {
		return this.carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public String getCarRegDate() {
		return this.carRegDate;
	}
	public void setCarRegDate(String carRegDate) {
		this.carRegDate = carRegDate;
	}

	public String getCarSeriesId() {
		return this.carSeriesId;
	}
	public void setCarSeriesId(String carSeriesId) {
		this.carSeriesId = carSeriesId;
	}

	public String getCarSeriesName() {
		return this.carSeriesName;
	}
	public void setCarSeriesName(String carSeriesName) {
		this.carSeriesName = carSeriesName;
	}

	public String getCarVin() {
		return this.carVin;
	}
	public void setCarVin(String carVin) {
		this.carVin = carVin;
	}

	public String getLicPlateAddress() {
		return this.licPlateAddress;
	}
	public void setLicPlateAddress(String licPlateAddress) {
		this.licPlateAddress = licPlateAddress;
	}

	public String getLicPlateNo() {
		return this.licPlateNo;
	}
	public void setLicPlateNo(String licPlateNo) {
		this.licPlateNo = licPlateNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
