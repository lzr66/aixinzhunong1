package Controller;

import Database.database;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.JsonTool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojo.footprint;
import pojo.goods;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@RequestMapping("/goods")
public class goodsController {


    JSONObject jsonObject= new JSONObject();
    @GetMapping("/select")

    public String selectAllgooods() throws SQLException {
        ResultSet resultSet= database.selectAllgood();
        JsonTool jsonTool= new JsonTool();
        String json=jsonTool.resultSetToJson(resultSet);
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("data",json);
        return  jsonObject.toJSONString();
    }


    @GetMapping("/put")
    public  String insertAnnouncement(@RequestParam String goodId,
                                      @RequestParam String goodName,
                                      @RequestParam String category,
                                      @RequestParam String supplierId,
                                      @RequestParam int price,
                                      @RequestParam String picture)
    {
        goods goods = new goods();
       // database.generateFootprint(goods);
        jsonObject.put("code",200);
        return jsonObject.toJSONString();

    }
}
