package com.andreirookie.em_compose.ui.elements

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ItemsColumn() {
    LazyColumn() {
        item {
            Text(text = "First item")
        }
        items(5) { index ->
            Text(text = "Item: $index")
// IllegalStateException: Vertically scrollable component was measured with an infinity
// maximum height constraints, which is disallowed.
// One of the common reasons is nesting layouts like
// LazyColumn and Column(Modifier.verticalScroll()).

//            LazyColumn() {
//                items(1) { indexInternal ->
//                    Text(text = "Item: $indexInternal")
//                }
//            }
        }

        // Add another single item
        item {
            Text(text = "Last item")
        }
    }
}