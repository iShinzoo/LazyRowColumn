package com.example.lazyrowcolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lazyrowcolumn.ui.theme.LazyRowColumnTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
@Preview
fun Greeting() {
    val listofCourse = mutableListOf<CourseModel>()
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))
    listofCourse.add(CourseModel(R.drawable.img,"Krishna","Chips mang rha ha "))

    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        LazyColumn(){
            itemsIndexed(listofCourse){
                index, item ->
                CourseModelUi(CourseName = item.CourseName, CourseDesc = item.CourseDesc)
            }
        }
    }
}

@Composable
fun CourseModelUi(
    CourseName: String,
    CourseDesc: String
){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ){
        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = "image",
            modifier = Modifier
                .width(60.dp)
                .padding(6.dp)
        )
        Column {
            Text(text = CourseName,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )

            Text(text = CourseDesc,
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}

data class CourseModel (
    val CourseImg : Int,
    val CourseName : String,
    val CourseDesc : String
)


