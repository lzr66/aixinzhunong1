package Controller;

import Database.database;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.JsonTool;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
@RequestMapping("/pro")
public class proController {
    JSONObject jsonObject= new JSONObject();

    @GetMapping("/select")
    public String selectAllpro() throws SQLException {
        ResultSet resultSet= database.selectAllpro();
        JsonTool jsonTool= new JsonTool();
        String json=jsonTool.resultSetToJson(resultSet);
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("data",json);
        return  jsonObject.toJSONString();
    }
}
